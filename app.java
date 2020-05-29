package phonedir;

class smsgate{
    public void sendsms(int mob){
        //Some API places here to call
    }
}

class app{
    public static void main(String[] args) {
        int cell = 9988776655;
        smsgate sms = new smsgate();
        sms.sendsms(cell);
    }
}