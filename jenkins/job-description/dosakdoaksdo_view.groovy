 
listView('dosakdoaksdo Jobs') {
    description('dosakdoaksdo Jobs')
    jobs {
        regex('dosakdoaksdo_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
