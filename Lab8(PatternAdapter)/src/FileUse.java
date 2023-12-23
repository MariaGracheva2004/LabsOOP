class FileUse implements TypeFile {
    @Override
    public void copyfile(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("txt")) {
            System.out.println("Копирование файла mp4: " + fileName);
        } else if (fileType.equalsIgnoreCase("jmp")) {
            System.out.println("Копирование файла jmp: " + fileName);
        } else {
            System.out.println("Недопустимый формат файла");
        }
    }
}