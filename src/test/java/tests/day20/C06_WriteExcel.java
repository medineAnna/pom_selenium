package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {
    @Test
    public void test01() throws IOException {
        //1.dosyaya ulasalim
        String path="src/test/java/reseurces/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        //2.class'da calismak icin dosyanin bir kopyasi olan workbook olusturalim
        Workbook workbook= WorkbookFactory.create(fis);

        //3.dosyada yapmak istedigimz degisiklikleri kopya workbook'a yapalim
        //ulkeler excel'ne 5.sutun olarak nufus sutununu ekleyelim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        //3.satirdaki ulkenin nufusunu 1 mln yapalim
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");

        //4.kopyada yaptigimiz degisiklikleri ana dosyaya kayit edelim
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
    }
}
