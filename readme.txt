readme.txt
������:

������� API. ��� ������ ��������� ��� ������:
1) ������ �� ������ ������ �� ���� ����������, � ����������
   ������� ������ �� ����� - @GetMapping("/tradavgrate")
2) ������ �� ������ ������ ������� ������ �� ���� ���������� �� ������
  (@GetMapping("/tradavgperiod"))

  �� ���������� ������ ��� ���������� ��������� ������ ��
���������� ������� �� ���������� ���� ������. �������
�������������� API ������ �������� � ��������� ����� ������ (�.�.
�������� ������ �� ���� ������ ).
(package com.lista.avgcursbank.model.services ScheduledTasksCron.java
��������� � application.properties ���������� job.cron.rate
��� ������ �������� �������� @GetMapping("/tradeadd")
)

��� ������������:
1) ���������� ������������ ��������� API
https://api.monobank.ua/docs/
https://minfin.com.ua/ua/developers/api/
https://api.privatbank.ua/#p24/exchange
��� ������� �� ����������� ����������� ����� ����������                    
��������� ����������

2) Cron job - ��� ���������� ������������� ������ � api�����������.
3) Java/Kotlin, Tomcat, Spring Boot, Hibernate, PostgresQL; Git;
http://localhost:8888/actuator/health  - test site
4) ������� ������ ���� ����������������� � �������������� Swagger.
(http://localhost:8888/swagger-ui.html#/)

5) � �������� �������� �������� ������������ Gradle (�������������� Maven)

