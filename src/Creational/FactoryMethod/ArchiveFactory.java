package Creational.FactoryMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ArchiveFactory {
    private static Map<String, Supplier<Archiver>> archivers = new HashMap<>();

    public static final String ZIP_ARCHIVER = "zip";
    public static final String RAR_ARCHIVER = "rar";

    static {
        archivers.put("zip", ZipArchiver::new);
        archivers.put("rar", RarArchiver::new);
    }

    public static Archiver getArchiver(String archiverType) {
        return archivers.get(archiverType) == null ? null : archivers.get(archiverType).get();
    }
}
