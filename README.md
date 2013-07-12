BelajarHibernate
================

Belajar Hibernate

Persiapan 
1. Buat database (mysql) dengan nama belajarhibernate ( sesuaikan dengan konfigurasi file hibernate.cfg.xml )

-> mysql -uroot -p -hlocalhost 

create database belajarhibernate

2. Edit file hibernate.cfg.xml

-> Untuk database mysql

connection.driver_class = com.mysql.jdbc.Driver

connection.url = jdbc:mysql://localhost:3306/belajarhibernate

connection.username = root atau [ menyesuaikan ]

connection.password = [ menyesuaikan ]
