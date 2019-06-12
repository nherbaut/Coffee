JAVA_FILES=$(find . -name pom.xml)
for i in $JAVA_FILES; do
    sed -i -r "s/<version>1.0-SNAPSHOT<\/version>/<version>1.0.0-SNAPSHOT<\/version>/g" $i
    
done
rm -rf ./src/main/java/webmapi


