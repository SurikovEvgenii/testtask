# Описание
Утилита записывает разные типы данных в соответствующие файлы, которые содержат только определенный тип данных: 
* Целочисленные;
* Вещественные;
* Строки;

Файлы создаются по мере необходимости. Если определенный из вышеописанных типов данных отсутствует, то файл не создается.

Если потребуется, то можно вывести краткую или полную статистику по каждому типу данных.

## Запуск программы

Для запуска программы достаточно иметь установленную JRE на вашем компьютере.

>**Формат передачи параметров:** `-s -a -p <prefix> -o <path> <file.txt>`

>**Пример запуска программы:** `java -jar util.jar -s -a -p sample- -o path/files in1.txt in2.txt`
><br/>В данном примере у вас будет выведена краткая статистика по данным, информация в файле будет дополнена, у файлов будет указан префикс '-sample', путь сохранения файлов будет /path/files. 

>При запуске программы передаются следующие параметры:
>1. `-p <prefix>` - установка префикса в наименовании файлов;
>2. `-o <path>` - установка собственного пути записи выходных файлов;
>3. `-s` - вывод краткой статистики по записанным параметрам, указывает их количество сегментируя по типу данных;
>4. `-f` - вывод расширенной статистики по записанным параметрам. Для строк выводит их количество, максимальную и минимальную длину. Для числовых значений выводится общее количество, минимальное, максимальное, среднее значение и сумму всех чисел соответствующего типа;
>5. `-a` - если указан параметр, то происходит добавление информации в существующий файл;
><br/>
><br/>
>>[!IMPORTANT] 1.При одновременном указании параметров `-s` и `-f` выводится только полная статистика. <br/> 2.Если не указать <path>, то запись будет произведена в месторасположение файла по умолчанию. <br/> 3.Если не указать <prefix>, то он не добавится. <br/><br/> Ошибка не возникнет, но возникнет предупреждение.

### Настройки по умолчанию
1. Запись данных в текущей папки
2. Префикс имен отсутствует
3. Файлы перезаписываются

>[!IMPORTANT]
>Расширение файлов для считывания и вывода данных `.txt`. 

>[!IMPORTANT]
>Данные в файле должны начинаться с новой строки. Каждая строка должна содержать только один определенный данных. 
>
>>Пример входного файла:
>>
>>```
>>Lorem ipsum dolor sit amet
>>45
>>Пример
>>3.1415
>>consectetur adipiscing
>>-0.001
>>тестовое задание
>>100500
>>Пример входного файла in2.txt
>>Нормальная форма числа с плавающей запятой 
>>1.528535047E-25
>>Long
>>1234567890123456789
>>```





