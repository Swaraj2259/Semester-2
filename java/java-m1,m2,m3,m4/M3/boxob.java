class box{
    int height;
    int width;
    int depth;

    box(box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }   
}



box(box ob){
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
}
box mybox1 = new box(10, 20, 15);
box mybox2 =new box();
box mycube = new box(7);
box myclone = new box(mybox1);

