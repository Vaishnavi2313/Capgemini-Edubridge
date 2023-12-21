package com.abc;

import java.util.*;


public class Main {

	public static void main(String[] args) {
List<Insect> list=new ArrayList<>();
		
		Insect i1=new Insect("Ant",45);
		Insect i2=new Insect("Cockroach",65);
		Insect i3=new Insect("bee",99);
		Insect i4=new Insect("paper wasp",11);
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		
		Insecticide insecticide=new Insecticide();
		
		System.out.println(insecticide.mapInsectName(list));
		
		
		for (Insect insect : list) {
			System.out.print(insect.getName());
		}
		
		for (Insect insect2 : list) {
			if (insect2.getWeight()>40 && insect2.getWeight()<100) {
				System.out.print(insect2);	
			}
		}
		
		
		
		System.out.println();
		
		
		List<String> insectNameList=new ArrayList<>();
		Insect insect=new Insect();
		
		for (Insect obj : list) {
			insectNameList.add(obj.getName());
		}
		
		System.out.println(insectNameList);

	}

}


class Insect{
	private String name;
	private int weight;
	public Insect() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insect(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Insect [name=" + name + ", weight=" + weight + "]";
	}
	
	
}



class Insecticide{
	
	
	public List<String> mapInsectName(List<Insect> list){
		
		List<String> insectNameList=new ArrayList<>();
		Insect insect=new Insect();
		
		for (Insect obj : list) {
			insectNameList.add(obj.getName());
		}
		
		return insectNameList;
		
	}
		

	
}