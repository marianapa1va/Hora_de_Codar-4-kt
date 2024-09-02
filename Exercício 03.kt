fun main(){
    //"Vamos criar uma lista de compras.
    //
    //Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
    //
    //Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
    //
    //Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
    //
    //Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
    //
    //Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada."


    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Pera", "Manga")

    while (frutas.isNotEmpty()){

        println("Lista de frutas disponíveis: ${frutas.joinToString(", ")}")
        val remover = readln().trim()
        if (remover != null) {
            if (frutas.contains(remover)) {

                frutas.remove(remover)

                println("Fruta foi retirada da lista.")
            } else {

                println("Fruta indisponível no nosso mercado.")
            }
        } else {
            println("Entrada inválida. Por favor, digite o nome da fruta.")
        }

    }




}