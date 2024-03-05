/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tag t1 = new Tag("porte", "es");
        Tag t2 = new Tag("porte", "fr");
        Tag t3 = new Tag("Navidad", "es");
        Tag t4 = new Tag("árbol", "es");
        String texto = "Este es el primer post que escribo y por eso tiene muchos caracteres, "
                + "porque es el primero de los que voy a escribir";
        Post p1 = new TextPost("Pepe", "Mi primer post", texto);
        Post p2 = new ImagePost("Pepe", "Mi segundo post", "imagen1.jpg", 100, 1000);
        Post p3 = new TextPost("Juan", "Un post", "Este es un buen post.");
        Post p4 = new ImagePost("Juan", "Otro post de imagen", "imagen2.jpg", 100, 2000);
        p1.addTag(t1);
        p1.addTag(t2);
        p1.addTag(t3);
        p2.addTag(t4);
        System.out.println(p1);
        p2.like();
        System.out.println(p2);
        MessageBoard mb = new MessageBoard();
        mb.addPost(p1);
        mb.addPost(p2);
        mb.addPost(p3);
        mb.addPost(p4);

        mb.addImagePost(p1);
        mb.addImagePost(p2);
        mb.addImagePost(p3);
        mb.addImagePost(p4);
        
        System.out.println(mb.totalsize()+1);
        Post l = mb.longerPost();
        System.out.println(l);
        
        ArrayList <Post> img = mb.getImagePosts();
        System.out.println(img.get(0));
    }
}
