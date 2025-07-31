# Пример таблицы с вычисляемыми ячейками!

![](@document/editable-table.calculating-cells)
### Описание таблицы:

**column_1** - *редактируемая ячейка*

**column_2** - *редактируемая ячейка*

**column_3** - *ячейка содержащая результат сложения двух предыдущих ячеек и умноженное на число 3*

*- в случае введения некорректных данных в 1 или 3 ячейку, в 3 ячейка выводится ошибка*

---
***Ниже приведено описание реализации данной таблицы, код данной таблицы находится - examples/calculations/calculating.yaml, данные для таблицы - examples/calculations/calculations_data.yaml***

``` yaml
docs:
    editable-table.calculating-cells:
        type: editable-table 
        # указываем что это редактируемые таблицы
        filtration: false
        # filtration - Отражение фильтров
        format: >
            (
                {
                    "calculations": table
                }     
            )   
        # JSONata выражение позволяющее преобразовать данные перед сохранением
        # Перед сохранением данных осуществляется загрузка данных из файла по указанному пути.

    # Данные из файла доступны как параметр (origin) "file" (зарезервированное имя)
    # Данные из таблицы доступны как параметр (origin) "table" (зарезервированное имя)

    headers:
      - value: column_1
        # value - Идентификатор
        width: 150px
        # width - Ширина колонки (px)
        editable: false
        # editable - Возможность редактирования
        save:
          path: calculations.yaml
        # path - путь к файлу для сохранения

      - value: column_2
        width: 150px
        editable: true
        save:
          path: calculations.yaml

      - value: column_3
        width: 150px
        type: fn
        # Указываем что данные берем из результата выполнения fn
        fn: >
          (
             $multiplication:= 3;
             $sum:=$number(row."column_1") + $number(row."column_2");
             $sum*$multiplication;
          )

        # В функции - суммируются значения полученные из row1 и row2
        # далее полученное значение умножается на значение multiplication
        # Во время сохранения данных через UI числа сохраняются как строки,
        # поэтому для их сложения необходимо привести их к числу с помощью функции $number()

        # Данные из текущей строки доступны как параметр (origin) "row" (зарезервированное имя)

    source: >
      (
          {
              "body": $.calculations
          }
      )
    # Результатом выполнения выражения в source ожидается объект с обязательным полем body и опциональным headers
    # в данном случае мы возвращаем entity calculations из озера данных