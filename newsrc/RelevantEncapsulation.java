public class Exporter {

    private string fileDir = "";

    public void SetFilePath(string newFileDir) {
        if(FileUtils.DirExists(newFileDir)) {
            this.fileDir = newFileDir;
        }
        throw new FilePathInvalidException("The new file path doesn't exist!");
    }

}

