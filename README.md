## Experience of service (Подсчет выслуги лет)

This code made in Java as a web-app serves for calculating experience of service.

Это приложние написано на #Java и задумано как калькулятор выслуги лет. Может быть полезно для подсчета календарной, льготной и общей выслуги.

Логика описана в DateService и DateServiceImpl.

Для подсчета льготной выслуги используется коэффициент 1,5 - т.е. для случаев, когда применятеся выслуга год за полтора.
Для иных выриантов (год за два и год за три) функционал появится позднее.

Полный подсчет происходит в контроллере по эндпоинту: experience/getInfo
на вход подаются:
- количесво лет в армии
- количество месяцев в армии
- количество лет в академии (для проходивших обучение в военных и специальных военных учреждений)
- количество меяцев в акадении (в некоторых случаях необходимо)
- в формате json дата подписания первого контракта

Первая версия подсчитывает количество календарных лет-месяцев-дней, льготных лет-месяцев-дней (исходя из того, что с первого дя контракта и по н.в выслуга считается как год за полтора) и общая выслуга лет-месяцев-дней.

При испоьзовании приложения, если не актуально считать службу в армии и учебу в академии, количество лет/месяцев в армии вводится равным "0" - нулю.


Пример:
2 года в армии, в академии не учился, первый контракт с 30.05.2008, вывод будет строкой: 

# Календарная выслуга: 15 лет 11 месяцев 29 дней | льготная: 7 лет 0 месяцев 1 дней | общая: 22 лет 11 месяцев 30 дней
