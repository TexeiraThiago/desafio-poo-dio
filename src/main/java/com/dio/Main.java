package com.dio;

import com.dio.dominio.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        Set<Conteudo> conteudos = new HashSet<>();
        conteudos.add(curso1);
        conteudos.add(curso2);
        conteudos.add(mentoria);
        bootCamp.setConteudos(conteudos);

        Dev dev = new Dev();
        dev.setNome("Developer 1");
        dev.inscreverBoopcamp(bootCamp);
        System.out.println("Conteúdos inscritos: " +dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("---".repeat(100));
        System.out.println("Conteúdos concluídos: " +dev.getConteudosConcluidos());
        System.out.println("XP: "+ dev.calcularTotalXP());
        System.out.println("Conteúdos inscritos: " +dev.getConteudosInscritos());
        System.out.println("---".repeat(100));
        Dev dev2 = new Dev();
        dev2.setNome("Developer 2");
        dev2.inscreverBoopcamp(bootCamp);
        System.out.println("Conteúdos inscritos: " +dev2.getConteudosInscritos());
        System.out.println("---".repeat(100));
        dev2.progredir();
        System.out.println("Conteúdos concluídos: " +dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularTotalXP());
        System.out.println("Conteúdos inscritos: " +dev2.getConteudosInscritos());

//        System.out.println(bootCamp);
    }
}