



#include "myserver.h"
#include "mythread.h"

MyServer::MyServer(QObject *parent) :
    QTcpServer(parent)
{
}

void MyServer::startServer()
{
    int port = 1234;

    if(!this->listen(QHostAddress::Any,port))
    {
        QTextStream(stdout) << "Could not start server"<<endl;
    }
    else
    {
        QTextStream(stdout) << "Listening to port " << port << "..."<<endl;
    }
}

void MyServer::incomingConnection(qintptr socketDescriptor)
{
    // We have a new connection
    QTextStream(stdout)<< socketDescriptor << " Connecting..."<<endl;

    MyThread *thread = new MyThread(socketDescriptor, this);

    // connect signal/slot
    // once a thread is not needed, it will be beleted later
    connect(thread, SIGNAL(finished()), thread, SLOT(deleteLater()));

    thread->start();
}





