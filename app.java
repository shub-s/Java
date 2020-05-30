class smsgate{
    public void sendsms(long mob){
        System.out.println("SMS Send Successfull");
    }
}

class app{
    public static void main(String[] args) {
        long cell = 9988776655L;
        smsgate sms = new smsgate();
        sms.sendsms(cell);
    }
}