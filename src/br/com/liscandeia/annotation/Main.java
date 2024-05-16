package br.com.liscandeia.annotation;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        Class<?> clazz = ClassAnnotation.class;

        Table tableAnnotation = clazz.getAnnotation(Table.class);
        String nomeDaTabela = tableAnnotation.value();

        System.out.println("Nome da tabela: " + nomeDaTabela);

    }
}