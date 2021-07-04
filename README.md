# assignment-api

list of saved data
=> http:localhost:8080/api/v1/form</br>
[
    {
        "id": "3123",
        "label": "labal data",
        "render": "render data",
        "elements": [
            {
                "title": "element title",
                "save": {
                    "type": "save type",
                    "render": "reander ",
                    "name": "name",
                    "label": "save labal",
                    "htmlClass": "htmal class",
                    "buttonType": "button type",
                    "program": [
                        1,
                        2,
                        3,
                        4,
                        5
                    ]
                }
            }
        ]
    }
]


save new record => http:localhost:8080/api/v1/form/save

{
"id":"3123",
"label":"labal data",
"render":"render data",
"elements":[
{
"title":"element title",
"save":{
"type":"save type",
"render":"reander ",
"name":"name",
"label":"save labal",
"htmlClass":"htmal class",
"buttonType":"button type",
"program":[1,2,3,4,5]
}

        }
    ]
}


