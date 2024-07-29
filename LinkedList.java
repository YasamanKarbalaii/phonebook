package ep11;

public class LinkedList {
    Node header;

    public LinkedList() {
        this.header = null;
    }
    public void insert(Person d){
        Node n=new Node(d);
        n.next=this.header;
        this.header=n;
    }
    public boolean equals(Object obj){
        Node t=this.header;
        Person p=(Person) obj;
         if(t.d.getFname().compareTo(p.getFname())==0&&t.d.getLname().compareTo(p.getLname())==0
                &&t.d.getPhone().compareTo(p.getPhone())==0)
            return true;
        else return false;
    }

    public boolean search(Person d) {
        boolean a=false;
        Node t = this.header;
        while (t != null) {
            if (this.equals(d) == true) a = true;
            else a = false;
            t = t.next;
        }
        return a;
    }

    @Override
    public String toString() {
      String s="";
      Node t=this.header;
      while (t!=null){
          s+=t.d.toString()+"\n";
          t=t.next;
      }
      return s;
    }
    public void remove(Person d){
        Node t=this.header;
        if(t!=null&&t.d.equals(null)==true)this.header = t.next;
        else {
            while (t!=null&&t.next!=null&&t.next.d.equals(d)==false) t=t.next;
            if(t.next!=null)t.next=t.next.next;
        }
    }
    public int count(Person d){
        int sum=0;
        Node t=this.header;
        while (t!=null){
            if(t.d.equals(d)==true)sum++;
        }
        return sum;
    }
    public void removeall(Person d){
        Node n=this.header;
        int count=this.count(d);
        for(int i=0;i<count;i++){
            this.remove(d);
        }
    }
   public void search(String name,String lastname,String phone){
       Node t=this.header;
       if(t.d.getFname().compareTo(name)==0 && t.d.getLname().compareTo(lastname)==0){
           t.d.setPhone(phone);
           System.out.println("done!!");
       }
       else{
           System.out.println("we don't have this person");
       }
   }

}

