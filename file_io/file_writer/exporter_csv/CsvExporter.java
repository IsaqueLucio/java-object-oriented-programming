package file_io.file_writer.exporter_csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvExporter {

    public void exportUsers(List<String> users){
        //declaro a variavel com a localização da pasta
        File folder = new File("file_io/file_writer/exporter_csv/database_csv");
        //se a pasta de destino não existir
         if(!folder.exists()){
            //a pasta então é criada
            folder.mkdirs();
            System.out.println("Folder 'database_csv' created with success.");
        }
        //declaro que o arquivo a ser registrado no hd vai ficar na localização da variavel folder e que o seu nome vai ser users.csv
        File csvFile = new File(folder,"users.csv");
        //agora ele então vai tentar criar a variavel que vai ficar responsavel pela escrita no arquivo, por isso o arquivo é passado como parametro
        try{
            FileWriter writer = new FileWriter(csvFile);
            //agora eu utilizo o metodo de escrever da variavel writer e passo o cabeçalho que vai estar presente no arquivo
            writer.write("ID, NOME\n");
           for(int i=0;i<users.size();i++){
            //para cada usuario na lista, o i (inidice) vira o ID e o nome do usuario não muda
                writer.write(i+","+users.get(i)+"\n");
            }
            //fechando para evitar b.o
            writer.close();
            //se der erro ele pega esse erro 
        } catch(IOException e){
            //e tranforma numa mensagem mais legivel
            System.out.println("Error: "+e.getMessage());
        }

        
    }
}
