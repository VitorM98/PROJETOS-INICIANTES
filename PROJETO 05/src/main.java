//JOGO DE PERGUNTAS

import java.util.Scanner;

public class main {
	
	
	public int[] numeros = {10,20,30};
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int pontos = 10;
		int soma = pontos * 2;
		int soma1 = soma + pontos;
		int soma2 = soma1 + pontos;
		int soma3 = soma2 + pontos;
		int soma4 = soma3 + pontos;
		int soma5 = soma4 + pontos;
		
		System.out.println("Seja bem-vindo! Pressione \"S\" para continuar.");
				String string = scanner.nextLine().toLowerCase(); 
				
				if(string.equals("s")) {
					System.out.println("Qual a capital da Bahia?");
					string = scanner.nextLine().toLowerCase().toUpperCase();
					if(string.equals("SALVADOR")) {
						System.out.println("Voc� acertou! Nota: "+pontos);
						System.out.println("Voc� deseja continuar? (s) ou voc� deseja desistir (d) ?");
						string = scanner.nextLine().toLowerCase().toUpperCase();
						if(string.equals("S")) {
							// Pr�xima Pergunta.
							System.out.println("Qual a cor do c�u?");
							string = scanner.nextLine().toLowerCase().toUpperCase();
							if(string.equals("AZUL")) {

								System.out.println("Voc� acertou! Sua pontua��o �: "+soma);
								System.out.println("Voc� deseja continuar? (s) ou voc� deseja desistir (d) ?");
								string = scanner.nextLine().toLowerCase().toUpperCase();
								if(string.equals("S")) {
									//PR�XIMA PERGUNTA.
									System.out.println("Qual fruta tem o mesmo nome da sua cor?");
									string = scanner.nextLine().toLowerCase().toUpperCase();
									if(string.equals("LARANJA")) {
										System.out.println("Voc� acertou! Sua pontua��o �: "+soma1);
										System.out.println("Voc� deseja continuar? (s) ou voc� deseja desistir (d) ?");
										string = scanner.nextLine().toLowerCase().toUpperCase();
										if(string.equals("S")) {
											System.out.println("Qual ve�culo de duas rodas podemos pedalar?");
											string = scanner.nextLine().toLowerCase().toUpperCase();
											if(string.equals("BICICLETA")) {
												System.out.println("Voc� acertou! Sua pontua��o �: "+soma2);
												System.out.println("Voc� deseja continuar? (s) ou voc� deseja desistir (d) ?");	
												string = scanner.nextLine().toLowerCase().toUpperCase();
												if(string.equals("S")) {
													//pergunta
													System.out.println("Qual � o nome do maior mam�fero que vive no mar?");
													string = scanner.nextLine().toLowerCase().toUpperCase();
													if(string.equals("BALEIA")) {
														System.out.println("Voc� acertou! Sua pontua��o �: "+soma3);
														System.out.println("Voc� deseja continuar? (s) ou voc� deseja desistir (d) ?");	
														string = scanner.nextLine().toLowerCase().toUpperCase();
														if(string.equals("S")) {
															//pergunta
															System.out.println("Qual bebida alco�lica � feito de uva?");
															string = scanner.nextLine().toLowerCase().toUpperCase();
															if(string.equals("VINHO")) {
																System.out.println("Voc� acertou! Sua pontua��o �: "+soma4);
																System.out.println("Voc� deseja continuar? (s) ou voc� deseja desistir (d) ?");	
																string = scanner.nextLine().toLowerCase().toUpperCase();
																if(string.equals("S")) {
																	//pergunta
																	System.out.println("Qual o nome da banda que tinha como integrantes: John Lennon e Paul Mccartney?");
																	string = scanner.nextLine().toLowerCase().toUpperCase();
																	if(string.equals("BEATLES")) {
																		System.out.println("Voc� Acertou e o jogo terminou! Sua pontua��o final � de: "+soma5);
																	} else {System.out.println("Voc� errou! Sua pontua��o final � de: "+soma4);}
																}
															} else {
																System.out.println("Voc� errou! Sua pontua��o final � de: "+soma3);
															}
														} else {
															System.out.println("Game over! O jogo acabou e a sua pontua��o final �: " +soma3);
														}
													} else {
														System.out.println("Voc� errou! Sua pontua��o final � de: "+soma2);
													}
												} else {
													System.out.println("Game over! O jogo acabou e a sua pontua��o final �: " +soma2);
												}
											} else {
												System.out.println("Voc� errou! Sua pontua��o final � de: "+soma1);
											}
										} else {
											System.out.println("Game over! O jogo acabou e a sua pontua��o final �: " +soma1);
										}
									} else {
										System.out.println("Voc� errou! Sua pontua��o final � de: "+soma);
									}
								} else {
									System.out.println("Game over! O jogo acabou e a sua pontua��o final �: " +soma);
								}
								
							} else {
								System.out.println("Errado! Sua pontua��o final � "+pontos);
							}
							
							} else {
								System.out.println("Game over! O jogo acabou e a sua pontua��o final �: " +pontos);
							}
							
						}
						else { System.out.println("Voc� errou! Tente novamente."); 
						string = scanner.nextLine().toLowerCase(); 
						if (string.equals("Salvador")) {
							System.out.println("Voc� agora acertou! Sua pontua��o � de: "+pontos);
							
						} else { 
							System.out.println("Voc� errou 2 vezes... Infelizmente suas chances acabaram.");
						}
					}
				} else {
					System.out.println("Tecla errada, voc� deveria ter pressionado \"S\".");
				}
		

	}
	
	}


