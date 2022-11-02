 
listView('testCai-repo-name Jobs') {
    description('testCai-repo-name Jobs')
    jobs {
        regex('testCai-repo-name_.+')
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
