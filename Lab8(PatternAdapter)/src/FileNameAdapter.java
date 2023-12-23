
 class FileNameAdapter implements NameFile {
    private FileUse fileuse;

    public FileNameAdapter(FileUse fileuse)
    {
        this.fileuse = fileuse;
    }

    @Override
    public void nameFile(String fileName)
    {
        fileuse.copyfile("txt", fileName);
    }
}