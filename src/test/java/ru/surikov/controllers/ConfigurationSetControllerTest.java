package ru.surikov.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.surikov.entities.Configuration;
import ru.surikov.exceptions.PrefixNotFoundException;
import ru.surikov.exceptions.SystemPathParamNotFound;

import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationSetControllerTest {

    @Test
    @DisplayName("Test null prefix")
    public void testConfigurationSetOne() {
        String[] args = {"-s", "-p", "-prefix", "-o", "test\\output", "test\\in1.txt", "test2\\in2.txt"};
        Configuration config = new Configuration();
        assertThrows(PrefixNotFoundException.class, () -> {
            for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-")) {
                if (args[i].contains("p")) {
                    config.setP(true);
                    if (args[i + 1].matches("^(?!-).*$")) {
                        config.setPrefix(args[i + 1]);
                    }
                }
            }
            }

            if(config.getPrefix() == null) {
                config.setPrefix("");
                throw new PrefixNotFoundException("Prefix not found!");
            }
            if(config.getSavePath() == null) {
                throw new SystemPathParamNotFound("Save path not found! Please enter a save path after param -o");
            }
        });
        assertEquals("", config.getPrefix());
    }

    @Test
    @DisplayName("Test -s and -f parameter")
    public void testConfigurationSetTwo() {
        Configuration configuration = new Configuration();
        String[] args = {"-s", "-f", "-p", "_static-" , "-o", "str\\else", "in1.txt", "in2.txt"};
        ConfigurationSetController.setConfig(args, configuration);
        assertFalse(configuration.getS());
        assertTrue(configuration.getF());
        assertEquals("_static-", configuration.getPrefix());
        assertEquals(Paths.get("str\\else").toAbsolutePath().toString(), configuration.getSavePath());
        assertEquals(Paths.get("in1.txt").toAbsolutePath().toString(), configuration.getListOfFileName().get(0));
        assertEquals(Paths.get("in2.txt").toAbsolutePath().toString(), configuration.getListOfFileName().get(1));
    }

    @Test
    @DisplayName("Test save path")
    public void testConfigurationSetThree() {
        Configuration configurationTwo = new Configuration();
        String[] args = {"-s", "-p", "test", "-o", "output", "test\\in1.txt", "test2\\in2.txt"};
        ConfigurationSetController.setConfig(args, configurationTwo);
        assertEquals("test", configurationTwo.getPrefix());
        assertEquals(Paths.get("output").toAbsolutePath().toString(), configurationTwo.getSavePath());
        assertEquals(Paths.get("test\\in1.txt").toAbsolutePath().toString(), configurationTwo.getListOfFileName().get(0));
        assertEquals(Paths.get("test2\\in2.txt").toAbsolutePath().toString(), configurationTwo.getListOfFileName().get(1));
    }

    @Test
    @DisplayName("Test prefix \"\"")
    public void testConfigurationSetFour() {
        Configuration configurationTwo = new Configuration();
        String[] args = {"-s", "-f", "-p", "", "-o", "test\\output", "in1.txt"};
        ConfigurationSetController.setConfig(args, configurationTwo);
        assertEquals("", configurationTwo.getPrefix());
        assertEquals(Paths.get("in1.txt").toAbsolutePath().toString(), configurationTwo.getListOfFileName().get(0));
    }

}
