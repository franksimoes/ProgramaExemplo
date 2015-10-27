
public class P1 {

    public static void main(String[] args) {

    // inicia contador da lista de Nomes e Notas
    int i = 0;
    // inicia somador media de aluno
    float sumAluno = 0;
    // inicia somador media da Turma
    float sumTurma = 0;
    
    String[] TurmaAlunoNomeArray = { 
             "Sam", "Smith", "Robert", "Delgro", "James", 
             "Gosling", "Vando", "Alfredo", "Mário", "Juvenall",
             "Levi", "Jurema", "Paulo", "Oswaldo", "Valéria",
             "Ricardo", "Raimunda", "Maria", "José", "Apolinário",
             "Anabel", "Janaina", "Aparecida", "Lucia", "Priscila",
             "Marcia", "Marcelo", "Bartolo", "Carlos", "Cassio",
             "Conrrado", "Catarina", "Duarte", "Dora", "Vitória",
             "Endora", "Elvira", "Helena", "Hortência", "Holanda",
             "Iolanda", "Joice", "Juca", "Joelcio", "Jacinto",
             "Leonardo","Lucio", "Lucas", "Renato", "Robson",
           };
        
    Float [] []  NotasAlunoArray = { 
            {(float)1.1,(float)1.2,(float)1.3,(float)1.4,(float)1.5},
            {(float)2.1,(float)2.2,(float)2.3,(float)2.4,(float)2.5},
            {(float)3.1,(float)3.2,(float)3.3,(float)3.4,(float)3.5},
            {(float)4.1,(float)4.2,(float)4.3,(float)4.4,(float)4.5},
            {(float)5.1,(float)5.2,(float)5.3,(float)5.4,(float)5.5},
            {(float)6.1,(float)6.2,(float)6.3,(float)6.4,(float)6.5},
            {(float)7.1,(float)7.2,(float)7.3,(float)7.4,(float)7.5},
            {(float)8.1,(float)8.2,(float)8.3,(float)8.4,(float)8.5},
            {(float)9.1,(float)9.2,(float)9.3,(float)9.4,(float)9.5},
            {(float)10.1,(float)10.2,(float)10.3,(float)10.4,(float)10.5},         
            {(float)11.1,(float)11.2,(float)11.3,(float)11.4,(float)11.5},
            {(float)12.1,(float)12.2,(float)12.3,(float)12.4,(float)12.5},
            {(float)13.1,(float)13.2,(float)13.3,(float)13.4,(float)13.5},
            {(float)14.1,(float)14.2,(float)14.3,(float)14.4,(float)14.5},
            {(float)15.1,(float)15.2,(float)15.3,(float)15.4,(float)15.5},
            {(float)16.1,(float)16.2,(float)16.3,(float)16.4,(float)16.5},
            {(float)17.1,(float)17.2,(float)17.3,(float)17.4,(float)17.5},
            {(float)18.1,(float)18.2,(float)18.3,(float)18.4,(float)18.5},
            {(float)19.1,(float)19.2,(float)19.3,(float)19.4,(float)19.5},
            {(float)20.1,(float)20.2,(float)20.3,(float)20.4,(float)20.5},                  
            {(float)21.1,(float)21.2,(float)21.3,(float)21.4,(float)21.5},
            {(float)22.1,(float)22.2,(float)22.3,(float)22.4,(float)22.5},
            {(float)23.1,(float)23.2,(float)23.3,(float)23.4,(float)23.5},
            {(float)24.1,(float)24.2,(float)24.3,(float)24.4,(float)24.5},
            {(float)25.1,(float)25.2,(float)25.3,(float)25.4,(float)25.5},
            {(float)26.1,(float)26.2,(float)26.3,(float)26.4,(float)26.5},
            {(float)27.1,(float)27.2,(float)27.3,(float)27.4,(float)27.5},
            {(float)28.1,(float)28.2,(float)28.3,(float)28.4,(float)28.5},
            {(float)29.1,(float)29.2,(float)29.3,(float)29.4,(float)29.5},
            {(float)30.1,(float)30.2,(float)30.3,(float)30.4,(float)30.5},                                 
            {(float)31.1,(float)31.2,(float)31.3,(float)31.4,(float)31.5},
            {(float)32.1,(float)32.2,(float)32.3,(float)32.4,(float)32.5},
            {(float)33.1,(float)33.2,(float)33.3,(float)33.4,(float)33.5},
            {(float)34.1,(float)34.2,(float)34.3,(float)34.4,(float)34.5},
            {(float)35.1,(float)35.2,(float)35.3,(float)35.4,(float)35.5},
            {(float)36.1,(float)36.2,(float)36.3,(float)36.4,(float)36.5},
            {(float)37.1,(float)37.2,(float)37.3,(float)37.4,(float)37.5},
            {(float)38.1,(float)38.2,(float)38.3,(float)38.4,(float)38.5},
            {(float)39.1,(float)39.2,(float)39.3,(float)39.4,(float)39.5},
            {(float)40.1,(float)40.2,(float)40.3,(float)40.4,(float)40.5},                                               
            {(float)41.1,(float)41.2,(float)41.3,(float)41.4,(float)41.5},
            {(float)42.1,(float)42.2,(float)42.3,(float)42.4,(float)42.5},
            {(float)43.1,(float)43.2,(float)43.3,(float)43.4,(float)43.5},
            {(float)44.1,(float)44.2,(float)44.3,(float)44.4,(float)44.5},
            {(float)45.1,(float)45.2,(float)45.3,(float)45.4,(float)45.5},
            {(float)46.1,(float)46.2,(float)46.3,(float)46.4,(float)46.5},
            {(float)47.1,(float)47.2,(float)47.3,(float)47.4,(float)47.5},
            {(float)48.1,(float)48.2,(float)48.3,(float)48.4,(float)48.5},
            {(float)49.1,(float)49.2,(float)49.3,(float)49.4,(float)49.5},
            {(float)50.1,(float)50.2,(float)50.3,(float)50.4,(float)50.5},                  
            };        
         
    System.out.print("\n");
    // Cabeçalho da Lista
    System.out.print( "Número " + String.format("%-15s"," - Nome do Aluno       ") + "- N1    " + "N2    " + "N3    " + "N4    " + "N5    "  + "Med  " );
    System.out.print("\n");
    
    while( i < TurmaAlunoNomeArray.length ) {
                    System.out.print( " " + String.format("%03d" , i + 1) + "    - " + String.format("%-15s", TurmaAlunoNomeArray[i]) + "     - " );
                    //System.out.print( NotasAlunoArray [0][0] + "-" + NotasAlunoArray [0][1] + "-" + NotasAlunoArray [0][2] +"-" + NotasAlunoArray [0][3] +"-" + NotasAlunoArray [0][4]);

                    for(int g = 0; g < 5 ; g++ ) {
                                // imprime as 5 notas do Aluno.
                                System.out.print( String.format("%04.1f",NotasAlunoArray [i][g]) + "  ");
                                sumAluno = NotasAlunoArray [i][g] + sumAluno;
                                 }
                    // Media do Aluno 
                    System.out.print( String.format("%04.1f",sumAluno/5) + "  ");
                    sumTurma = sumTurma +  sumAluno/5;
                    // zerar acumulador das médias para próximo aluno
                    sumAluno = 0;
                    //soma contador de lista dos alunos
                    i++;
                    System.out.print("\n");
                                        
                    }
        
    System.out.print("\n");       
    System.out.print( "Media da Turma de 50 alunos = " + String.format("%04.1f",sumTurma/50));
    System.out.print("\n");
    }
    
}
