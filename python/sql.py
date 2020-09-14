import pymysql


def main(name):
    db = pymysql.connect("localhost", "pvs", "pvs++2019", "pvs")
    # sql = "select * from paves_cms_user where username = '%s'" % name
    cursor = db.cursor()
    # count = cursor.execute(sql)
    count = cursor.execute("select * from paves_cms_user where username = %s", name)
    print(count)


if __name__ == '__main__':
    name = "test' or '1'='1"
    main(name)