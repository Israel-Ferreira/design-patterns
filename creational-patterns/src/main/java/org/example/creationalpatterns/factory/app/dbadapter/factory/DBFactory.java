package org.example.creationalpatterns.factory.app.dbadapter.factory;


import org.example.creationalpatterns.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
