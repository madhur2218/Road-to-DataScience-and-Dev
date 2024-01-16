db.SAMI.find();
db.SAMI.find({"Name":"Madhur"})

db.SAMI.find({tags :{ $in : ["gel", "blue"]}})
db.SAMI.find({tags :{ $in : ["gel"]}})


db.BMW.find().sort({first_name: 1})
db.BMW.find().sort({first_name: -1})
db.BMW.find().sort({first_name:1}).limit(1)
db.BMW.find().sort({first_name:-1}).limit(2)

db.BMW.find({},{underWarranty: false})
db.BMW.find({}, {first_name:"Madhur", last_name: "Bhatia"})

db.BMW.updateOne({first_name: "Madhur"}, {$set:{isFullTime: false}})
db.BMW.updateMany({}, {$set: {isFullTime: true}})
db.BMW.updateMany({isFullTime:{$exits:false}}, {$set:{isFullTime:true}})

db.Audi.drop() // deletes a collection
db.BMW.deleteOne({first_name: "Madhur"})
db.BMW.deleteMany({isFullTime: false})

db.BMW.find({value : {$get:32}})
db.BMW.find({value: {$gte: 10, $lte: 120}})
db.BMW.find({name: {$in: ["Madhur", "Malhar"]}})
db.BMW.find({
    $and: [
      { underWarranty: true },
      { value: { $gte: 12 } }
    ]
  })
  

  

