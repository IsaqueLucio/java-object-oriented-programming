package file_io.file_reader_and_writer.backup_system;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BackupService {
    //na classe de teste é criado duas variaveis do tipo String com o caminho de leitura do arquivo para backup 'sourcePath'
    //e tbm outra para o caminho onde o backup deve ser registrado, no 'destinationPath'. 
    public void createBackup(String sourcePath, String destinationPath){
        //traduz o caminho passado na variavel tipo string sourcePath para uma variavel do tipo 'File'
        File sourceFile = new File(sourcePath);
        //o arquivo de leitura precisa existir para o metdodo funcionar, se não existe não tem como o metodo funcionar, então é dado um return
        if(!sourceFile.exists()){
            System.out.println("Error: Origin file not found.");
            return;
        }
        //traduz o caminho passado na variavel tipo string destinationPath para um arquivo tipo 'File'
        File destinationFolder = new File(destinationPath);
        //se a pasta de destino não existir podemos cria-la para abrigar o backup
        if(!destinationFolder.exists()){
            destinationFolder.mkdirs();
            System.out.println("Folder destination created with sucess.");
        }
        //agora que é garantido que a pasta de destino exista, é criado o arquivo de destino
        File backupFile = new File(destinationFolder, "BackupFile.txt");
        //agora ele tenta criar na memoria o arquivo de leitura e tbm o escritor que vai escrever o arquivo de backup
        try(BufferedReader originalFileReader = new BufferedReader(new FileReader(sourceFile));
            FileWriter writerBackup = new FileWriter(backupFile)){
                //se tudo ocorrer bem nas linhas 30/31, é feito a criação da variavel de leitura das linhas do arquivo original 
                String originalLine = originalFileReader.readLine();
                //se não houver linhas no arquivo não tem porque escrever nada
                 if(originalLine == null){
                    System.out.println("The file is empty, nothing was written in the backup file.");
                    return;
                    //se houver se sabe então que vão ser escritos no arquivo de backup
                } else System.out.println("Backup file created with sucess!");
                 // e enquanto houver linhas no arquivo
                while (originalLine != null) {
                    //a variavel de escrita criada no try, escreve essa mesma linha no arquivo de backup
                    writerBackup.write(originalLine+"\n");
                    originalLine = originalFileReader.readLine();
                }

                //caso ocorra algum erro na linha 30/31, a mensagem de erro é transportada de maneira legivel pelo o catch
            } catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
    }

}
