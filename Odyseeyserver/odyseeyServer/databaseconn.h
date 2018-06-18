#ifndef DATABASECONN_H
#define DATABASECONN_H
#include <QtSql/QtSql>
#include <QtSql/QSqlDatabase>
#include <QtSql/QSqlQuery>


#include <QtDebug>
#include<iostream>

class DatabaseConn
{
private:
    QSqlDatabase database;

public:
    DatabaseConn();
    void connectAndOpenDB();
    void disconnectAndCloseDB();


};

#endif // DATABASECONN_H
