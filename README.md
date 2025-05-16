# Инструкция по сборке и запуску
## 1 Клонируй проект
``` 
git clone https://github.com/T0Tom845/excel-demo.git
``` 
## 2 Открыть в своей любимой IDE / Перейти в директорию проекта
``` 
cd excel-demo
``` 
## 3 Собери проект с помощью Maven
``` 
mvn clean install
``` 
## 4 Запусти
``` 
mvn spring-boot:run
``` 
## 5 Использование
Если приложение успешно запустилось можно запустить браузер и перейти на:
``` 
http://localhost:8080/swagger-ui.html
``` 
Или же любым другим удобным образом отправить запрос   
```
GET http://localhost:8080/nth-min?path=[your-path-to-xlsx-file]&n=[nth-min]
```
В данном тестовом примере приложение включает в себя файл example.xlsx. чтобы его использовать надо, можно указать путь к нему, например:
```
C:\Users\[User]\IdeaProjects\excel-demo\src\main\resources\example.xlsx
```
