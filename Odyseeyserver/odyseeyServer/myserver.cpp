#include "myserver.h"

MyServer::MyServer(QObject *parent) : QTcpServer(parent)
{

}


void MyServer::StartServer(){

    if(!this->listen(QHostAddress::Any,1234)){

        qDebug() << "Could not start server";


    }else{

        qDebug() << "Server Listening...";

    }

}

void MyServer::incomingConnection(int socketDescriptor){

    qDebug() <<socketDescriptor <<"Connecting...";
    MyThread *thread = new MyThread(socketDescriptor,this);
    connect(thread, SIGNAL(finished()),thread, SLOT(deleteLater()));
    thread->start();
}
