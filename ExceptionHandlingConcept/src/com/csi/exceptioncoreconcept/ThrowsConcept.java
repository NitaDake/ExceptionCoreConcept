package com.csi.exceptioncoreconcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowsConcept {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc");
}
}
