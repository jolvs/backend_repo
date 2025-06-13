package src.utils;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String converterDateParaDataEHora(Date data){

        //EXEMPLO: 12/06/2025 23:34
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY - HH:mm");
        return formatador.format(data);
    }

    public static String converterDateParaData(Date data){

        //EXEMPLO: 12/06/2025
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
        return formatador.format(data);
    }

    public static String converterDateParaHora(Date data){

        //EXEMPLO: 23:34:05
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(data);
    }
    
}
