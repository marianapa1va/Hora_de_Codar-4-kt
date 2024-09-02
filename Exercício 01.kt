fun main(){
//"Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles. "

    var cadastrados: Int = 0

    while (true){
        print("Informe o nome do Aluno que você deseja cadastrar: ")
        var aluno = readln()

        cadastrados = cadastrados +1

        if (aluno == "pare" ){
            println("Alunos cadastrados: ${cadastrados - 1}")
            return
        }
    }

}