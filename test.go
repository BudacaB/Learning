package main

import (
	"fmt"
	"os/exec"

)

func execute() {

	var executeWith string

	outStatus:= exec.Command(executeWith, "git status").Output()
	outputStatus := string(outStatus[:])
	fmt.Println(outputStatus)

}

func main() {
	execute()
}
