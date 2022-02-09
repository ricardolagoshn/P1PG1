package com.aplicacion.p1pg1.configuraciones;

import android.hardware.camera2.CameraDevice;

public class Transacciones
{
    // Nombre de la base de datos
    public static final String NameDatabase = "PM01DB";

    // Creacion de las tablas Empleados en la base de datos
    public static final String tablaempleados = "empleados";

    /*
      Campos especificos de la tabla empleados
    */
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String edad = "edad";
    public static final String correo = "correo";

    /* Transacciones DDL (data definition lenguage)*/

    public static final String CreateTableEmpleados = "CREATE TABLE " + tablaempleados +
            "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "nombres TEXT, apellidos TEXT, edad INTEGER, correo TEXT)";

    public static final String DropTableEmpleados = "DROP TABLE IF EXISTS " + tablaempleados;
}
