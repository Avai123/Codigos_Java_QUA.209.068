package principal;

import java.util.Scanner;

public class Atividadetelevisor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Criar um programa para simular um controle remoto, na classe televisor ter�o
		 * so atributos: 1.canal 2.volume 3.ligado/desligado
		 * 
		 * e o s metodos 1.ligar televisor 2.aumentar volume 3.aumentar canal 4.diminuir
		 * canal
		 * 
		 * quando ligar o televisor o canal padr�o � ocanal 1 volume e canal n�o podem
		 * ter valores menor que O volume m�ximo � 16 canal m�ximo � 15 mostre o status
		 * atual do televisor (se ligado: mostre o canal, o volume e ligado s se
		 * desligado: mostre o televisor desligado.
		 */

		Televisor tv = new Televisor();
		
		tv.mostrarStaus();
		tv.ligarTelevisor();
		tv.mostrarStaus();
		
		
	}}
