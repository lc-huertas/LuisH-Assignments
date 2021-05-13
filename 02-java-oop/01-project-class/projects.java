class projects {
    // Variables ==========================================
    private String name;
    private String description;
    
    // Set project name
    public void setName(String name){
        this.name=name;
    }
    // Get project name
    public String getName(){
        return name;
    }

    // Set project description
    public void setDesc(String description){
        this.description=description;
    }
    // Get project name
    public String getDesc(){
        return description;
    }
    // Constructors ==========================================
    public projects(){
    }
    public projects(String name){
        this.name=name;
    }
    public projects(String name,String description){
        this.name=name;
        this.description=description;
    }
    // Methods ===============================================
    public String elevatorPitch(){
        String msg = this.name + " : " + this.description;
        return msg;
    }
    // =======================================================
}
