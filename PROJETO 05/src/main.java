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
						System.out.println("Você acertou! Nota: "+pontos);
						System.out.println("Você deseja continuar? (s) ou você deseja desistir (d) ?");
						string = scanner.nextLine().toLowerCase().toUpperCase();
						if(string.equals("S")) {
							// Próxima Pergunta.
							System.out.println("Qual a cor do céu?");
							string = scanner.nextLine().toLowerCase().toUpperCase();
							if(string.equals("AZUL")) {

								System.out.println("Você acertou! Sua pontuação é: "+soma);
								System.out.println("Você deseja continuar? (s) ou você deseja desistir (d) ?");
								string = scanner.nextLine().toLowerCase().toUpperCase();
								if(string.equals("S")) {
									//PRÓXIMA PERGUNTA.
									System.out.println("Qual fruta tem o mesmo nome da sua cor?");
									string = scanner.nextLine().toLowerCase().toUpperCase();
									if(string.equals("LARANJA")) {
										System.out.println("Você acertou! Sua pontuação é: "+soma1);
										System.out.println("Você deseja continuar? (s) ou você deseja desistir (d) ?");
										string = scanner.nextLine().toLowerCase().toUpperCase();
										if(string.equals("S")) {
											System.out.println("Qual veículo de duas rodas podemos pedalar?");
											string = scanner.nextLine().toLowerCase().toUpperCase();
											if(string.equals("BICICLETA")) {
												System.out.println("Você acertou! Sua pontuação é: "+soma2);
												System.out.println("Você deseja continuar? (s) ou você deseja desistir (d) ?");	
												string = scanner.nextLine().toLowerCase().toUpperCase();
												if(string.equals("S")) {
													//pergunta
													System.out.println("Qual é o nome do maior mamífero que vive no mar?");
													string = scanner.nextLine().toLowerCase().toUpperCase();
													if(string.equals("BALEIA")) {
														System.out.println("Você acertou! Sua pontuação é: "+soma3);
														System.out.println("Você deseja continuar? (s) ou você deseja desistir (d) ?");	
														string = scanner.nextLine().toLowerCase().toUpperCase();
														if(string.equals("S")) {
															//pergunta
															System.out.println("Qual bebida alcoólica é feito de uva?");
															string = scanner.nextLine().toLowerCase().toUpperCase();
															if(string.equals("VINHO")) {
																System.out.println("Você acertou! Sua pontuação é: "+soma4);
																System.out.println("Você deseja continuar? (s) ou você deseja desistir (d) ?");	
																string = scanner.nextLine().toLowerCase().toUpperCase();
																if(string.equals("S")) {
																	//pergunta
																	System.out.println("Qual o nome da banda que tinha como integrantes: John Lennon e Paul Mccartney?");
																	string = scanner.nextLine().toLowerCase().toUpperCase();
																	if(string.equals("BEATLES")) {
																		System.out.println("Você Acertou e o jogo terminou! Sua pontuação final é de: "+soma5);
																	} else {System.out.println("Você errou! Sua pontuação final é de: "+soma4);}
																}
															} else {
																System.out.println("Você errou! Sua pontuação final é de: "+soma3);
															}
														} else {
															System.out.println("Game over! O jogo acabou e a sua pontuação final é: " +soma3);
														}
													} else {
														System.out.println("Você errou! Sua pontuação final é de: "+soma2);
													}
												} else {
													System.out.println("Game over! O jogo acabou e a sua pontuação final é: " +soma2);
												}
											} else {
												System.out.println("Você errou! Sua pontuação final é de: "+soma1);
											}
										} else {
											System.out.println("Game over! O jogo acabou e a sua pontuação final é: " +soma1);
										}
									} else {
										System.out.println("Você errou! Sua pontuação final é de: "+soma);
									}
								} else {
									System.out.println("Game over! O jogo acabou e a sua pontuação final é: " +soma);
								}
								
							} else {
								System.out.println("Errado! Sua pontuação final é "+pontos);
							}
							
							} else {
								System.out.println("Game over! O jogo acabou e a sua pontuação final é: " +pontos);
							}
							
						}
						else { System.out.println("Você errou! Tente novamente."); 
						string = scanner.nextLine().toLowerCase(); 
						if (string.equals("Salvador")) {
							System.out.println("Você agora acertou! Sua pontuação é de: "+pontos);
							
						} else { 
							System.out.println("Você errou 2 vezes... Infelizmente suas chances acabaram.");
						}
					}
				} else {
					System.out.println("Tecla errada, você deveria ter pressionado \"S\".");
				}
		

	}
	
	}


