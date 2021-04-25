package javabase.pojo;

public  class Women{
        //成员变量是私有的
        private String name;
        private  int leg; //public修饰的，可以随便修改
        //成员方法是共有的供外部使用
        public int getLeg() {
            return leg;
        }

        public String getName() {
            return name;
        }

        public void setLeg(int leg) {
            this.leg = leg;
        }

        public void setName(String name) {
            this.name = name;
        }
    }