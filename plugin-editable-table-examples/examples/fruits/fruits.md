# Описание примера с изменением данных во время сохранения!!

![](@document/editable-table.fruits)

**Суть таблицы, показать, изменения во время каждого сохранения** 

*В данной таблице, после сохранения, цена увеличивается в два раза*

---
***Ниже приведено описание реализации данной таблицы, код данной таблицы находится - examples/fruits/fruits.yaml, данные для таблицы - examples/fruits/fruits_data.yaml***

```yaml
docs:
  editable-table.fruits:
    type: editable-table
    filtration: false
    direction: ttb
    # Направление таблицы ttb (top to bottom)
    format: >
      (
         {"fruits":table ~> | * | {"price": $number(**.price) * 2} |}
      )

    # JSONata выражение позволяющее преобразовать данные после сохранения, в данном случае увеличиваем price в два раза
    # Перед сохранением данных осуществляется загрузка данных из файла по указанному пути.

    headers:
      - value: fruit
        text: Фрукт
        width: 150px
        editable: true
        save:
          path: fruits_data.yaml

      - value: count
        text: Количество
        width: 150px
        editable: true
        save:
          path: fruits_data.yaml

      - value: price
        text: Цена
        width: 150px
        editable: true
        save:
          path: fruits_data.yaml

    source: >
      (
          { 
              "body": $.fruits
          }
