#include "databaseconn.h"
#include <QtSql/QtSql>
#include <QtSql/QSqlDatabase>
#include <QtSql/QSqlQuery>


#include <QtDebug>
#include<iostream>

DatabaseConn::DatabaseConn(){
}


void DatabaseConn::connectAndOpenDB(){

   this->database = QSqlDatabase::addDatabase("QMYSQL");
   this->database.setHostName("localhost");
   this->database.setUserName("root");
   this->database.setPassword("root");
   this->database.setDatabaseName("OdyDatabase");
   this->database.setPort(3306);

   this->database.open();
   if(this->database.isOpen()){
       QTextStream(stdout) <<"Database opened!!!"<<endl;
   }else{
       QTextStream(stdout) <<"...DATABASE OPEN SECUENCE ERROR..."<<endl;
       QTextStream(stdout) <<database.lastError().text()<<endl;
       QTextStream(stdout) <<"...//DATABASE OPEN SECUENCE ERROR..."<<endl;
   }

}


void DatabaseConn::disconnectAndCloseDB(){

    if(this->database.isOpen()){
        this->database.close();
        QTextStream(stdout) <<"Database closed!!!"<<endl;
    }else{
        QTextStream(stdout) <<"Database is not opened, so i cant close it"<<endl;
    }

}


