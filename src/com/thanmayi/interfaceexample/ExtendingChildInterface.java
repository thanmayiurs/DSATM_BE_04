package com.thanmayi.interfaceexample;

public class ExtendingChildInterface implements ChildInterface,InterfaceOne
{
public void show()
{
	System.out.println("iam from childinterface");
}
public void print()
{
	System.out.println("iam from interfaceOne");
}
}