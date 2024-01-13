use School // creates a db called school
use MI //created a database MI 

db.createCollection("Class X ")  //CREATES A COLLECTION in database
db.dropDatabase("MI")  //Drops a database

//Insert one document in 
db.SAMI.insertOne({ Name: "Akshay", Marks: 500 })
db.SAMI.insertOne({ Name: "Madhur", Marks: 524 })
db.School.insertOne({ Name: "Malhar", Marks: 21, Gpa: 4.4 })
db.School.insertOne({ Name: "Naman", Marks: 43, Gpa: 1.2 })
db.School.insertOne({ Name: "Ishant", Marks: 12, Gpa 4.5})


//Finding a document
db.School.find()  or db.School.find({})



//Inserting multiple documents in db at one time
db.SAMI.insertMany([
    { item: "journal", qty: 25, tags: ["blank", "red"], size: { h: 14, w: 21, uom: "cm" } },
    { item: "mat", qty: 85, tags: ["gray"], size: { h: 27.9, w: 35.5, uom: "cm" } },
    { item: "mousepad", qty: 25, tags: ["gel", "blue"], size: { h: 19, w: 22.85, uom: "cm" } }
]);




db.Molecular_Imaging.insertMany([
    { item: "journal", qty: 25, tags: ["blank", "red"], size: { h: 14, w: 21, uom: "cm" } },
    { item: "mat", qty: 85, tags: ["gray"], size: { h: 27.9, w: 35.5, uom: "cm" } },
    { item: "mousepad", qty: 25, tags: ["gel", "blue"], size: { h: 19, w: 22.85, uom: "cm" } }
]);


db.SAMI.insertMany([
    { item: "journal", qty: 25, size: { h: 14, w: 21, uom: "cm" }, status: "A" },
    { item: "notebook", qty: 50, size: { h: 8.5, w: 11, uom: "in" }, status: "A" },
    { item: "paper", qty: 100, size: { h: 8.5, w: 11, uom: "in" }, status: "D" },
    { item: "planner", qty: 75, size: { h: 22.85, w: 30, uom: "cm" }, status: "D" },
    { item: "postcard", qty: 45, size: { h: 10, w: 15.25, uom: "cm" }, status: "A" }
]);


db.School.insertMany
([
    { item: "journal", qty: 25, size: { h: 14, w: 21, uom: "cm" }, status: "A" },
    { item: "notebook", qty: 50, size: { h: 8.5, w: 11, uom: "in" }, status: "A" },
    { item: "paper", qty: 100, size: { h: 8.5, w: 11, uom: "in" }, status: "D" }
]);


//Data Types
Strings
Int
Double
Boolean
Nulls
Date time
Arrays
Nested Document

eg:

db.School.insertOne({Name: "Madhur",RollNo : 12, GPA: 4.4, isFullTime: false, registerDate: new date() , graduationDate: null , courses: ["Maths", "Chemistry", "Biology"], address: {street: "Subhash Nagar", City: "New Delhi", Zip: "110027"}} )

//Sorting and Limiting 

db.School.find().sort({name: 1})  //fir ascending order 1
db.School.find().sort({name: -1}) // for descending order -1
db.School.find().sort({item: 1})

//Using sorting and limiting at the same time: 
db.School.find().sort({name:1}).limit(1)
db.School.find().sort({item:1}).limit(1)

//Find Query
db.School.find({isFullTime: false})
db.School.find({isFullTime: false, RollNo: 12})
db.School.find({isFullTime: false, RollNo: 2})

db.School.find({}, {name: true})
db.School.find({}, {id: false, name: true})
db.School.find({}, {id: 0, name: 1, GPA :1})

db.School.find({query}, {projection}) // This is imp, projection helps us to filter out the data which we want to show. Here we just need to mention the attribute value as True/False or 1/0 respectively.


//Updating Documents in MongoDb
db.School.updateOne(filter, update)
db.School.updateOne({Name: "Madhur"}, {$set: {isFullTime: true}})  //this will add a new parameter isFullTime as true 
//It is always recommeded to update by _id as there could be more than one same names in above case 

//eg:
db.School.updateOne({_id : ObjectId('65a2302ba9c0083c09511e9e')}, {$set: {isFullTime: false}}) //this will add on more parameter isFulltime 

//To remove a parameter, we can use $unset
db.School.updateOne({_id: ObjectId('65a2302ba9c0083c09511e9e')}, {$unset: {isFullTime: ""}}) // this will remove field isFullTime

//To update many documents
db.School.updateMany({}, {$set: {isFullTime: true}})
db.School.updateOne({name :"Madhur"},{$unset:{isFullTime: ""}})
db.School.updateMany({isFullTime:{$exits: false}}, {$set: {isFullTime: true}})

//Deleting a Document
db.School.deleteOne({name: "Madhur"})
db.School.deleteOne({RollNo:12})

db.School.deleteMany({isFullTime: false})


