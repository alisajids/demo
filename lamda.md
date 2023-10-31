1) duplicate from List<Integer> i = Arrays.asList<Integer>(5,3,1,3,4,9,9,9); 

List<Integer> i = Arrays.asList(5,3,1,3,4,9,9,9);
Set<Integer> set = new HashSet<>();
List<Integer> duplicates = new ArrayList<>();

for (Integer element : i) {
    if (!set.add(element)) {
        // If the element is already in the set, it's a duplicate
        duplicates.add(element);
    }
}

System.out.println("Duplicates: " + duplicates);

OR

List<Integer> i = Arrays.asList(5,3,1,3,4,9,9,9);
List<Integer> duplicates = i.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue() > 1)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());

System.out.println("Duplicates: " + duplicates);

2) Employ with max salary department wise from List<Employ> using java
Map<String, Employ> highestSalaryEmployMap = employList.stream()
    .collect(Collectors.groupingBy(
        Employ::getDepartment,
        Collectors.collectingAndThen(
            Collectors.maxBy(Comparator.comparingDouble(Employ::getSalary)),
            Optional::get)));

System.out.println(highestSalaryEmployMap);

3) In DB change the gender value F to M and M to F 

DECLARE @batchSize INT = 10000;  -- Update 10000 rows at a time
DECLARE @rowsAffected INT = 0;

WHILE 1 = 1  -- Loop until there are no more rows to update
BEGIN
  UPDATE TOP (@batchSize) my_table
  SET gender = CASE gender
                  WHEN 'F' THEN 'M'
                  WHEN 'M' THEN 'F'
               END
  WHERE gender IN ('F', 'M');  -- Only update rows with F or M gender

  SET @rowsAffected = @@ROWCOUNT;  -- Get the number of rows affected by the update

  IF @rowsAffected = 0  -- If no more rows were updated, exit the loop
    BREAK;

  WAITFOR DELAY '00:00:01';  -- Pause for 1 second before updating the next batch
END
