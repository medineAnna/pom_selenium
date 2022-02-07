package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {
        String path = "src/test/java/reseurces/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);
        // biz FIS ile okudugumuz wxcel dosyasini projemiz icerisinde kullanabilmek icin
        // Apachi POI dependency yardimi ile bir Workbook  olusturduk
        // Bu workbook bizim projemizin icerisinde ulkeler excel'inin bir kopyasini kullanmamizi sagliyor.
        // Excell in yapisi geregi bir hucreye(Cell) ulasabilmek icin workbook dan baslayarak
        // sirasi ile sheet row ve cell objeleri olusturmamiz gerekiyor.
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row= sheet.getRow(4);
        Cell cell = row.getCell(2);
        System.out.println(cell);

        // index'i 4 olan satirdaki index'i 2 olan hucrenin Andorra oldugunu test edin
        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);

        //5.index'deki satirin, 3.index'deki hucre bilgisini yazdirin
        row= sheet.getRow(5);
        cell= row.createCell(3);
        System.out.println(cell);
    }
}