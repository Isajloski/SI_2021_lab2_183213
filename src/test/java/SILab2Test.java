@Test
public void test1() {
    //Testing branch 1,2,3,4,5,9
    Time object = new Time(-99,0,0);
    List<Time> timeList = new ArrayList<>();
    timeList.add(object);
    try {
        SILab2.function(timeList );
    } catch (Exception e){
        assertEquals(e.getMessage(),"The hours are smaller than the minimum");
    }
}

@Test
public void test2() {
    //Testing branch 1,2,3,4,5,10
    Time object = new Time(26,0,0);
    List<Time> timeList = new ArrayList<>();
    timeList.add(object);
    try {
        SILab2.function(timeList );
    } catch (Exception e){
        assertEquals(e.getMessage(),"The hours are greater than the maximum");
    }
}

@Test
public void test3() {
    //Testing branch 1,2,3,4,6,11
    Time object = new Time(26,-30,0);
    List<Time> timeList = new ArrayList<>();
    timeList.add(object);
    try {
        SILab2.function(timeList );
    } catch (Exception e){
        assertEquals(e.getMessage(),"The minutes are not valid");
    }
}

@Test
public void test4() {
    //Testing branch 1,2,3,4,6,12,13,4,15
    Time object = new Time(13,30,0);
    List<Time> timeList = new ArrayList<>();
    timeList .add(time);
    List<Integer> result = new ArrayList<>();
    timeList.add(object);
    result = SILab2.function(timeList);
    assertEquals(result.get(0).intValue().time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
}

@Test
public void test5() {
    //Testing branch 1,2,3,4,6,14
    Time object = new Time(13,30,0);
    List<Time> timeList = new ArrayList<>();
    timeList.add(object);
    try {
        SILab2.function(timeList );
    } catch (Exception e){
        assertEquals(e.getMessage(),"The seconds are not valid");
    }
}

@Test
public void test6() {
    //Testing branch 1,2,3,4,7,4,15
    Time object = new Time(24,0,0);
    List<Time> timeList = new ArrayList<>();
    timeList.add(object);
    List<Integer> result = new ArrayList<>();
    result = SILab2.function(timeList);
    assertEquals(result.get(0).intValue().time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
}

@Test
public void test7() {
    //Testing branch 1,2,3,4,8
    Time object = new Time(24,3,2);
    List<Time> timeList = new ArrayList<>();
    timeList.add(object);
    try {
        SILab2.function(timeList );
    } catch (Exception e){
        assertEquals(e.getMessage(),"The time is greater than the maximum");
    }
}


/////Path
@Test
public void test1() {
    //PATH Test
    //Testing path 
    Time time = new Time(13,30,0);
    Time time1 = new Time(14,30,0);
    Time time2 = new Time(15,30,0);
    List<Time> timesList = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    timesList.add(time);
    timesList.add(time1);
    timesList.add(time2);
    result = SILab2.function(timesList);
	assertEquals(result.get(0).intValue().time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    assertEquals(result.get(1).intValue().time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    assertEquals(result.get(2).intValue().time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());

   
   
}