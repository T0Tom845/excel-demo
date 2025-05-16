package ru.totom.exceldemo;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "Excel API", description = "Работа с локальными Excel файлами")
public class DemoExcelController {

    private final ExcelService excelService;

    @SneakyThrows
    @GetMapping("/nth-min")
    @Operation(summary = "Получить N-ое минимальное число из локального Excel-файла",
    parameters = {
            @Parameter(name = "path", description = "Путь к локальному .xlsx файлу", required = true),
            @Parameter(name = "n", description = "Номер числа по минимальности", required = true)
    })
    public int getNthMin(@RequestParam String path,@RequestParam int n){
        return excelService.findNthMinFromPath(path, n);
    }
}
