


Download the Selenium Server jar file in host machine(Machine A). Navigate to the folder and mark that machine as Hub.
on Machine A (Hub):
Bash
java -jar selenium-server-4.49.0.jar hub


On Machine B & C (Nodes):On another machine which would become node(s), ensure Java is installed. Download the Selenium server jar file. Navigae to that folder and mark that machine as Node.

Bash
java -jar selenium-server-4.49.0.jar node --hub http://<HUB-IP-ADDRESS>:4444 --max-sessions 4

Ensure that node and hub are connected. Can see the details in Selenium grid console.

Run the test file in hub. It should be executed in node machine.