package com.oops.class_;

public class project_main {
    public static void main(String[] args){
        project hackathon = new project();

        hackathon.setGroup_name("Code_Blooded");
        System.out.println("The project group name is "+hackathon.getGroup_name());

        hackathon.setGroup_members(6);
        System.out.println("There are "+hackathon.getGroup_members()+" members in the group");
    }
}
