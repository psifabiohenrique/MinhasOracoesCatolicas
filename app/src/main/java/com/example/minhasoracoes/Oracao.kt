package com.example.minhasoracoes


data class Oracao(val titulo: String, val conteudo: String, var numero: Int = 0, var eMisterio: Boolean = false, var numeroMisterio: Int = 0)

fun criarAveMaria(numero: Int, numeroMisterio: Int = 0) : Oracao {
    val novaOracao = Oracao(aveMaria.titulo, aveMaria.conteudo, numero = numero, numeroMisterio = numeroMisterio)
    return novaOracao
}

fun criarOracao(oracao: Oracao, numeroMisterio: Int = 0, eMisterio: Boolean = false) : Oracao {
    val novaOracao = Oracao(oracao.titulo, oracao.conteudo, numeroMisterio = numeroMisterio, eMisterio = eMisterio)
    return novaOracao
}

val paiNosso = Oracao("Pai Nosso", "Pai Nosso que estais no céu, santificado seja o vosso nome, vem a nós o vosso reino, seja feita a vossa vontade assim na terra como no céu. O pão nosso de cada dia nos daí hoje, perdoai-nos as nossas ofensas, assim como nós perdoamos a quem nos tem ofendido e não nos deixei cair em tentação, mas livrai-nos do mal. Amém.")
val aveMaria = Oracao("Ave Maria", "Ave Maria, cheia de graça, o Senhor é convosco, bendita sois Vós entre as mulheres, bendito é o fruto em Vosso ventre, Jesus. Santa Maria Mãe de Deus, rogai por nós, os pecadores, agora e na hora de nossa morte. Amém.")
val sinalDaCruz = Oracao("Sinal da Cruz", "Em nome do Pai, do Filho e do Espírito Santo. Amem.")
val oferecimento = Oracao("Oferecimento do Terço", "Divino Jesus, nós Vos oferecemos este terço que vamos rezar, meditando nos mistérios da Vossa Redenção. Concedei-nos, por intercessão da Virgem Maria, Mãe de Deus e nossa Mãe, as virtudes que nos são necessárias para bem rezá-lo e a graça de ganharmos as indulgências desta santa devoção.")
val credo = Oracao("Credo", "Creio em Deus Pai Todo-Poderoso, Criador do Céu e da Terra; e em Jesus Cristo, Seu único Filho, Nosso Senhor; Que foi concebido pelo poder do Espírito Santo. Nasceu da Virgem Maria, padeceu sob Pôncio Pilatos, foi crucificado, morto, sepultado; desceu a mansão dos mortos. Ressuscitou no terceiro dia. Subiu ao Céu, onde está sentado à direita de Deus Pai Todo-Poderoso, de onde há-de vir a julgar os vivos e os mortos. Creio no Espírito Santo, na Santa Igreja Católica, na Comunhão dos Santos, na remissão dos pecados, na ressurreição da carne, na vida eterna. Amém.")
val gloria = Oracao("Glória", "Glória ao Pai, ao Filho e ao Espírito Santo. Assim como era no princípio, agora e sempre. Amem. \n \n Ó meu Jesus, perdoai-nos e livrai-nos do fogo do inferno; levai as almas todas para o Céu e socorrei principalmente as que mais precisarem de Vossa misericórdia.")
val ohMeuJesus = Oracao("Oh Meu Jesus", "")
val salveRainha = Oracao("Salve Rainha", "Salve, Rainha, Mãe de Misericórdia, vida, doçura e esperança nossa, Salve. A Vós bradamos, os degredados filhos de Eva. A Vós suspiramos, gemendo e chorando neste vale de lágrimas. Eia, pois, Advogada nossa, esses Vossos olhos misericordiosos a nós volvei; e depois deste desterro mostrai-nos Jesus, bendito o Fruto do Vosso ventre. Ó clemente, ó piedosa, ó doce sempre Virgem Maria. Rogai por nós, Santa Mãe de Deus, Para que sejamos dignos das promessas de Cristo. Amem")
val agradecimento = Oracao("Agradecimentos", "Infinitas graças vos damos, ó Soberana Rainha, pelos benefícios que todos os dias recebemos de vossas mãos liberais. Dignai-vos, agora e para sempre tomar-nos debaixo do vosso poderoso amparo e para mais vos agradecer, vos saudamos com uma Salve Rainha:")


val primeiroDoloroso = Oracao("1° Mistério Doloroso", "1º Mistério Contemplamos –  A oração e agonia no Horto das Oliveira")
val segundoDoloroso = Oracao("2° Mistério Doloroso", "2º Mistério Contemplamos – Flagelação de Nosso Senhor Jesus Cristo")
val terceiroDoloroso = Oracao("3° Mistério Doloroso", "3º Mistério Contemplamos –  A coroação de espinhos de Nosso Senhor Jesus Cristo")
val quartoDoloroso = Oracao("4° Mistério Doloroso", "4º Mistério Contemplamos – Nosso Senhor carregando a Cruz nas costas à caminho do Calvário")
val quintoDoloroso = Oracao("5° Mistério Doloroso", "5º Mistério Contemplamos – A Crucifixão e morte de Nosso Senhor Jesus Cristo")

val primeiroGozoso = Oracao("1° Mistério Gozoso", "1º Mistério Contemplamos – A Anunciação do Anjo e a Encarnação do Verbo")
val segundoGozoso = Oracao("2° Mistério Gozoso", "2º Mistério Contemplamos – A visitação de Maria a sua prima Santa Isabel")
val terceiroGozoso = Oracao("3° Mistério Gozoso", "3º Mistério Contemplamos –  Nascimento do Menino Jesus, na gruta fria em Belém")
val quartoGozoso = Oracao("4° Mistério Gozoso", "4º Mistério Contemplamos – A apresentação do Menino Jesus no templo, e a purificação de Maria")
val quintoGozoso = Oracao("5° Mistério Gozoso", "5º Mistério Contemplamos – A perda e o encontro do Menino Jesus no templo")

val primeiroGlorioso = Oracao("1° Mistério Glorioso", "1º Mistério Contemplamos – A Ressurreição de Nosso Senhor Jesus Cristo")
val segundoGlorioso = Oracao("2° Mistério Glorioso", "2º Mistério Contemplamos – A Ascensão de Nosso Senhor Jesus Cristo")
val terceiroGlorioso = Oracao("3° Mistério Glorioso", "3º Mistério Contemplamos –  A descida do Espírito Santo")
val quartoGlorioso = Oracao("4° Mistério Glorioso", "4º Mistério Contemplamos – A Assunção de Nossa Senhora aos Céus de corpo e alma")
val quintoGlorioso = Oracao("5° Mistério Glorioso", "5º Mistério Contemplamos – A Coroação de Nossa Senhora como Rainha do Céu  e da Terra dos Anjos e dos Homens.")

val primeiroLuminoso = Oracao("1° Mistério Luminoso", "1º Mistério Contemplamos – Batismo de Nosso Senhor Jesus Cristo no rio Jordão")
val segundoLuminoso = Oracao("2° Mistério Luminoso", "2º Mistério Contemplamos – Primeiro milagre de Jesus transformando a água em vinho nas bodas de Caaná.")
val terceiroLuminoso = Oracao("3° Mistério Luminoso", "3º Mistério Contemplamos –  Anunciação do Reino de Deus e o convite à conversão.")
val quartoLuminoso = Oracao("4° Mistério Luminoso", "4º Mistério Contemplamos – A transfiguração de Nosso Senhor no Monte Thabor")
val quintoLuminoso = Oracao("5° Mistério Luminoso", "5º Mistério Contemplamos – A Instituição da Eucaristia na Última Ceia")


val TercoDoloroso = listOf(
    sinalDaCruz, oferecimento, credo, paiNosso, criarAveMaria(1), criarAveMaria(2), criarAveMaria(3), gloria,
    criarOracao(primeiroDoloroso, 1, true), criarOracao(paiNosso, 1), criarAveMaria(1, 1), criarAveMaria(2, 1), criarAveMaria(3, 1),criarAveMaria(4, 1), criarAveMaria(5, 1), criarAveMaria(6, 1),criarAveMaria(7, 1), criarAveMaria(8, 1), criarAveMaria(9, 1), criarAveMaria(10, 1), criarOracao(gloria, 1),
    criarOracao(primeiroDoloroso, 2, true), criarOracao(paiNosso, 2),  criarAveMaria(1, 2), criarAveMaria(2, 2), criarAveMaria(3, 2),criarAveMaria(4, 2), criarAveMaria(5, 2), criarAveMaria(6, 2),criarAveMaria(7, 2), criarAveMaria(8, 2), criarAveMaria(9, 2), criarAveMaria(10, 2), criarOracao(gloria, 2),
    criarOracao(primeiroDoloroso, 3, true), criarOracao(paiNosso, 3),  criarAveMaria(1, 3), criarAveMaria(2, 3), criarAveMaria(3, 3),criarAveMaria(4, 3), criarAveMaria(5, 3), criarAveMaria(6, 3),criarAveMaria(7, 3), criarAveMaria(8, 3), criarAveMaria(9, 3), criarAveMaria(10, 3), criarOracao(gloria, 3),
    criarOracao(primeiroDoloroso, 4, true), criarOracao(paiNosso, 4),  criarAveMaria(1, 4), criarAveMaria(2, 4), criarAveMaria(3, 4),criarAveMaria(4, 4), criarAveMaria(5, 4), criarAveMaria(6, 4),criarAveMaria(7, 4), criarAveMaria(8, 4), criarAveMaria(9, 4), criarAveMaria(10, 4), criarOracao(gloria, 4),
    criarOracao(primeiroDoloroso, 5, true), criarOracao(paiNosso, 5),  criarAveMaria(1, 5), criarAveMaria(2, 5), criarAveMaria(3, 5),criarAveMaria(4, 5), criarAveMaria(5, 5), criarAveMaria(6, 5),criarAveMaria(7, 5), criarAveMaria(8, 5), criarAveMaria(9, 5), criarAveMaria(10, 5), criarOracao(gloria, 5),
    agradecimento, salveRainha, sinalDaCruz
)

val TercoGozoso = listOf(
    sinalDaCruz, oferecimento, credo, paiNosso, criarAveMaria(1), criarAveMaria(2), criarAveMaria(3), gloria,
    criarOracao(primeiroGozoso, 1, true), criarOracao(paiNosso, 1), criarAveMaria(1, 1), criarAveMaria(2, 1), criarAveMaria(3, 1),criarAveMaria(4, 1), criarAveMaria(5, 1), criarAveMaria(6, 1),criarAveMaria(7, 1), criarAveMaria(8, 1), criarAveMaria(9, 1), criarAveMaria(10, 1), criarOracao(gloria, 1),
    criarOracao(primeiroGozoso, 2, true), criarOracao(paiNosso, 2),  criarAveMaria(1, 2), criarAveMaria(2, 2), criarAveMaria(3, 2),criarAveMaria(4, 2), criarAveMaria(5, 2), criarAveMaria(6, 2),criarAveMaria(7, 2), criarAveMaria(8, 2), criarAveMaria(9, 2), criarAveMaria(10, 2), criarOracao(gloria, 2),
    criarOracao(primeiroGozoso, 3, true), criarOracao(paiNosso, 3),  criarAveMaria(1, 3), criarAveMaria(2, 3), criarAveMaria(3, 3),criarAveMaria(4, 3), criarAveMaria(5, 3), criarAveMaria(6, 3),criarAveMaria(7, 3), criarAveMaria(8, 3), criarAveMaria(9, 3), criarAveMaria(10, 3), criarOracao(gloria, 3),
    criarOracao(primeiroGozoso, 4, true), criarOracao(paiNosso, 4),  criarAveMaria(1, 4), criarAveMaria(2, 4), criarAveMaria(3, 4),criarAveMaria(4, 4), criarAveMaria(5, 4), criarAveMaria(6, 4),criarAveMaria(7, 4), criarAveMaria(8, 4), criarAveMaria(9, 4), criarAveMaria(10, 4), criarOracao(gloria, 4),
    criarOracao(primeiroGozoso, 5, true), criarOracao(paiNosso, 5),  criarAveMaria(1, 5), criarAveMaria(2, 5), criarAveMaria(3, 5),criarAveMaria(4, 5), criarAveMaria(5, 5), criarAveMaria(6, 5),criarAveMaria(7, 5), criarAveMaria(8, 5), criarAveMaria(9, 5), criarAveMaria(10, 5), criarOracao(gloria, 5),
    agradecimento, salveRainha, sinalDaCruz
)

val TercoGlorioso = listOf(
    sinalDaCruz, oferecimento, credo, paiNosso, criarAveMaria(1), criarAveMaria(2), criarAveMaria(3), gloria,
    criarOracao(primeiroGlorioso, 1, true), criarOracao(paiNosso, 1), criarAveMaria(1, 1), criarAveMaria(2, 1), criarAveMaria(3, 1),criarAveMaria(4, 1), criarAveMaria(5, 1), criarAveMaria(6, 1),criarAveMaria(7, 1), criarAveMaria(8, 1), criarAveMaria(9, 1), criarAveMaria(10, 1), criarOracao(gloria, 1),
    criarOracao(primeiroGlorioso, 2, true), criarOracao(paiNosso, 2),  criarAveMaria(1, 2), criarAveMaria(2, 2), criarAveMaria(3, 2),criarAveMaria(4, 2), criarAveMaria(5, 2), criarAveMaria(6, 2),criarAveMaria(7, 2), criarAveMaria(8, 2), criarAveMaria(9, 2), criarAveMaria(10, 2), criarOracao(gloria, 2),
    criarOracao(primeiroGlorioso, 3, true), criarOracao(paiNosso, 3),  criarAveMaria(1, 3), criarAveMaria(2, 3), criarAveMaria(3, 3),criarAveMaria(4, 3), criarAveMaria(5, 3), criarAveMaria(6, 3),criarAveMaria(7, 3), criarAveMaria(8, 3), criarAveMaria(9, 3), criarAveMaria(10, 3), criarOracao(gloria, 3),
    criarOracao(primeiroGlorioso, 4, true), criarOracao(paiNosso, 4),  criarAveMaria(1, 4), criarAveMaria(2, 4), criarAveMaria(3, 4),criarAveMaria(4, 4), criarAveMaria(5, 4), criarAveMaria(6, 4),criarAveMaria(7, 4), criarAveMaria(8, 4), criarAveMaria(9, 4), criarAveMaria(10, 4), criarOracao(gloria, 4),
    criarOracao(primeiroGlorioso, 5, true), criarOracao(paiNosso, 5),  criarAveMaria(1, 5), criarAveMaria(2, 5), criarAveMaria(3, 5),criarAveMaria(4, 5), criarAveMaria(5, 5), criarAveMaria(6, 5),criarAveMaria(7, 5), criarAveMaria(8, 5), criarAveMaria(9, 5), criarAveMaria(10, 5), criarOracao(gloria, 5),
    agradecimento, salveRainha, sinalDaCruz
)

val TercoLuminoso = listOf(
    sinalDaCruz, oferecimento, credo, paiNosso, criarAveMaria(1), criarAveMaria(2), criarAveMaria(3), gloria,
    criarOracao(primeiroLuminoso, 1, true), criarOracao(paiNosso, 1), criarAveMaria(1, 1), criarAveMaria(2, 1), criarAveMaria(3, 1),criarAveMaria(4, 1), criarAveMaria(5, 1), criarAveMaria(6, 1),criarAveMaria(7, 1), criarAveMaria(8, 1), criarAveMaria(9, 1), criarAveMaria(10, 1), criarOracao(gloria, 1),
    criarOracao(primeiroLuminoso, 2, true), criarOracao(paiNosso, 2),  criarAveMaria(1, 2), criarAveMaria(2, 2), criarAveMaria(3, 2),criarAveMaria(4, 2), criarAveMaria(5, 2), criarAveMaria(6, 2),criarAveMaria(7, 2), criarAveMaria(8, 2), criarAveMaria(9, 2), criarAveMaria(10, 2), criarOracao(gloria, 2),
    criarOracao(primeiroLuminoso, 3, true), criarOracao(paiNosso, 3),  criarAveMaria(1, 3), criarAveMaria(2, 3), criarAveMaria(3, 3),criarAveMaria(4, 3), criarAveMaria(5, 3), criarAveMaria(6, 3),criarAveMaria(7, 3), criarAveMaria(8, 3), criarAveMaria(9, 3), criarAveMaria(10, 3), criarOracao(gloria, 3),
    criarOracao(primeiroLuminoso, 4, true), criarOracao(paiNosso, 4),  criarAveMaria(1, 4), criarAveMaria(2, 4), criarAveMaria(3, 4),criarAveMaria(4, 4), criarAveMaria(5, 4), criarAveMaria(6, 4),criarAveMaria(7, 4), criarAveMaria(8, 4), criarAveMaria(9, 4), criarAveMaria(10, 4), criarOracao(gloria, 4),
    criarOracao(primeiroLuminoso, 5, true), criarOracao(paiNosso, 5),  criarAveMaria(1, 5), criarAveMaria(2, 5), criarAveMaria(3, 5),criarAveMaria(4, 5), criarAveMaria(5, 5), criarAveMaria(6, 5),criarAveMaria(7, 5), criarAveMaria(8, 5), criarAveMaria(9, 5), criarAveMaria(10, 5), criarOracao(gloria, 5),
    agradecimento, salveRainha, sinalDaCruz
)